package de.trainharder.authentication.domain.model;

import de.trainharder.authentication.domain.model.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainSollte
{
	@Test
	@DisplayName("1 zurückgeben")
	void test01()
	{
		assertThat(Main.test()).isEqualTo(1);
	}
}
