package io.github.berryheyy.industria.enumm;

public enum MetalEnum
{
    ALUMINUM("Al", 0x425d75),
    BRONZE("CuSn", 0xb48536),
    COBALT("Co", 0x343598),
    COPPER("Cu", 0xa55d0d),
    LEAD("Pb", 0xa55d0d),
    NICKEL("Ni", 0xa55d0d),
    PLATINUM("Pt", 0xa55d0d),
    SILVER("Ag", 0xa55d0d),
    STEEL("Fe", 0xa55d0d),
    TIN("Sn", 0xa55d0d),
    TITANIUM("Ti", 0xa55d0d),
    TUNGSTEN("W", 0xa55d0d),
    WROUGHT_IRON("Fe\u2082SiO\u2084", 0xa55d0d),
    IRON("Fe", 0xa55d0d),
    ZINC("Zn", 0xa55d0d);

    public String molecularFormula;
    public int color;

    MetalEnum(String molecularFormula, int color)
    {
        this.molecularFormula = molecularFormula;
        this.color = color;
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
