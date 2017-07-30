package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass371 {

    @Ignore    private SampleClass372 sampleClass;

    public SampleClass371(){
        sampleClass = new SampleClass372();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}