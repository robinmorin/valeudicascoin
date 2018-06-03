package com.associate.valeudicascoin.db;

public class PropertyDB {
    private String name = new String();
    private String value = new String();
    private String tableBinding = new String();
    private String fieldBinding = new String();
    private TypeOf typeOfValue = TypeOf.STRING;
    private String additionalInfoNotDB = new String();


    /***
     * Default Constructor
     * @param name = Name of Property
     * @param value = Value of Property
     */
    public PropertyDB(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public PropertyDB(String name, String value, String tableBinding, String fieldBinding) {
        this.name = name;
        this.value = value;
        this.tableBinding = tableBinding;
        this.fieldBinding = fieldBinding;
    }

    public PropertyDB(String name, String value, String tableBinding, String fieldBinding, TypeOf typeOfValue) {
        this.name = name;
        this.value = value;
        this.tableBinding = tableBinding;
        this.fieldBinding = fieldBinding;
        this.typeOfValue = typeOfValue;
    }

    public PropertyDB(String name, String value, String tableBinding, String fieldBinding, TypeOf typeOfValue, String additionalInfoNotDB) {
        this.name = name;
        this.value = value;
        this.tableBinding = tableBinding;
        this.fieldBinding = fieldBinding;
        this.typeOfValue = typeOfValue;
        this.additionalInfoNotDB = additionalInfoNotDB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /***
     * Return which table is this property
     * @return
     */
    public String getTableBinding() {
        return tableBinding;
    }

    /***
     * Set which table is this property
     * @return
     */
    public void setTableBinding(String tableBinding) {
        this.tableBinding = tableBinding;
    }

    /***
     * Return which field of table is this property
     * @return
     */
    public String getFieldBinding() {
        return fieldBinding;
    }

    /***
     * Set which table is this property
     * @return
     */
    public void setFieldBinding(String fieldBinding) {
        this.fieldBinding = fieldBinding;
    }

    public TypeOf getTypeOfValue() {
        return typeOfValue;
    }

    public void setTypeOfValue(TypeOf typeOfValue) {
        this.typeOfValue = typeOfValue;
    }

    public String getAdditionalInfoNotDB() {
        return additionalInfoNotDB;
    }

    public void setAdditionalInfoNotDB(String additionalInfoNotDB) {
        this.additionalInfoNotDB = additionalInfoNotDB;
    }
}
