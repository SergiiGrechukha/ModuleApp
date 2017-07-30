package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass62 {

    @Ignore    private SampleClass63 sampleClass;

    public SampleClass62(){
        sampleClass = new SampleClass63();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}