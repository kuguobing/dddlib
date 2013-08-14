package com.dayatang.datasource4saas.mappingstrategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dayatang.datasource4saas.dscreator.TenantDbMappingStrategy;

public class MappingStrategyInstanceNameTest extends AbstractTenantDbMappingStrategyTest {

	@Before
	public void setUp() throws Exception {
		instance = TenantDbMappingStrategy.INSTANCE;
	}


	@Override
	@Test
	public void testGetInstanceName() {
		assertEquals("aaa", instance.getInstanceName("a", "xyz", mappings));
	}

}