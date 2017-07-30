package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass473 {

    @Ignore    private SampleClass474 sampleClass;

    public SampleClass473(){
        sampleClass = new SampleClass474();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}