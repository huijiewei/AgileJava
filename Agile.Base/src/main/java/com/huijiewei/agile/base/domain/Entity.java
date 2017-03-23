package com.huijiewei.agile.base.domain;

public abstract class Entity {
    private Integer id;

    public Integer getId() {
        return id;
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

        Entity other = (Entity) obj;

        if (other.isTransient() || this.isTransient()) {
            return false;
        }

        return this.id.equals(other.id);

    }

    @Override
    public int hashCode() {
        if (this.isTransient()) {
            return super.hashCode();
        }

        return this.id.hashCode() ^ 31;
    }
}
