package com.logiccache.jsonviewexample.web.dto.view;

public class View {
    public interface Anonymous {
    }

    public interface Public {
    }

    public interface Admin extends Public {
    }

    public interface Payroll extends Public {
    }

    public interface Private extends Admin {
    }
}
