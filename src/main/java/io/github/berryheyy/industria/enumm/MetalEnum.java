package io.github.berryheyy.industria.enumm;

public enum MetalEnum
{
    ALUMINUM("Al"),
    BRONZE("CuSn"),
    COBALT("Co"),
    COPPER("Cu"),
    LEAD("Pb"),
    NICKEL("Ni"),
    PLATINUM("Pt"),
    SILVER("Ag"),
    STEEL("Fe"),
    TIN("Sn"),
    TITANIUM("Ti"),
    TUNGSTEN("W"),
    WROUGHT_IRON("Fe\u2082SiO\u2084"),
    IRON("Fe"),
    ZINC("Zn");

    public String molecularFormula;

    MetalEnum(String molecularFormula)
    {
        this.molecularFormula = molecularFormula;

    }

    public String getItemName()
    {
        return this.name().toLowerCase();
    }

    public String getItemName(String suffix)
    {
        return this.name().toLowerCase() + suffix;
    }

}
