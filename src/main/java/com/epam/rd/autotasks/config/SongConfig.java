package com.epam.rd.autotasks.config;

import com.epam.rd.autotasks.Song;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Spring configuration that defines the {@link Song} bean.
 * <p>
 * {@link PropertySource} loads {@code application.properties} from the classpath
 * into the Spring {@code Environment}, and {@link Value} resolves the individual
 * properties, which are passed to the {@link Song} constructor.
 */
@Configuration
@PropertySource("classpath:application.properties")
public class SongConfig {

    /**
     * Creates a song whose attributes are read from the properties file.
     *
     * @param title  value of the {@code song.title} property
     * @param artist value of the {@code song.artist} property
     * @param year   value of the {@code song.year} property
     * @return configured song
     */
    @Bean
    public Song song(@Value("${song.title}") String title,
                     @Value("${song.artist}") String artist,
                     @Value("${song.year}") String year) {
        return new Song(title, artist, year);
    }
}
