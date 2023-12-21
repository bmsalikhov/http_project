package models;

public class InRadiusDto {
    final float latitude;
    final float longitude;
    final int radius;
    final int page;
    final int pageSize;

    public InRadiusDto(float latitude, float longitude, int radius, int page, int pageSize) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;
        this.page = page;
        this.pageSize = pageSize;
    }
}
