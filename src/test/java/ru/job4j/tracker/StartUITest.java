package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {
    @Test
    void whenAddItem() {
        String[] answer = {"Fix PC", "Fix Bug"};
        Input input = new MockInput(answer);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
        created = tracker.findAll()[1];
        expected = new Item("Fix Bug");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answer = {
                String.valueOf(item.getId()), /* id сохраненной заявки в объект tracker. */
                "edited item"
        };
        StartUI.replaceItem(new MockInput(answer), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("edited item");
    }

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answer = {String.valueOf(item.getId()), "delete item"};
        StartUI.deleteItem(new MockInput(answer), tracker);
        assertThat(tracker.findById(item.getId())).isNull();
    }
}