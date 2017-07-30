package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass269 {

    @Ignore    private SampleClass270 sampleClass;

    public SampleClass269(){
        sampleClass = new SampleClass270();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}