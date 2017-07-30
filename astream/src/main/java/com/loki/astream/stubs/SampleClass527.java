package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass527 {

    @Ignore    private SampleClass528 sampleClass;

    public SampleClass527(){
        sampleClass = new SampleClass528();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}