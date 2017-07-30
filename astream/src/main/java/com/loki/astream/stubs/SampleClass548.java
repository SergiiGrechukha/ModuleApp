package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass548 {

    @Ignore    private SampleClass549 sampleClass;

    public SampleClass548(){
        sampleClass = new SampleClass549();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}