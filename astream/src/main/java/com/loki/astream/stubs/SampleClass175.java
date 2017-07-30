package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass175 {

    @Ignore    private SampleClass176 sampleClass;

    public SampleClass175(){
        sampleClass = new SampleClass176();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}