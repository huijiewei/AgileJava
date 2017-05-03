package com.huijiewei.agile.base.domain;

public abstract class Entity {
    private Integer id;

    public Integer getId() {
        return this.id;
    }

    protected void setId(Integer id) {
        this.id = id;
    }

    public boolean isTransient() {
        return this.id == null;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        Entity other = this.getClass().cast(obj);

        if (this.isTransient() || other.isTransient()) {
            return false;
        }

        return this.getId().equals(other.getId());

    }

    @Override
    public int hashCode() {
        if (this.isTransient()) {
            return super.hashCode();
        }

        return this.getId().hashCode() ^ 31;
    }
}
