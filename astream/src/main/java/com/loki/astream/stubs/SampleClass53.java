package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass53 {

    @Ignore    private SampleClass54 sampleClass;

    public SampleClass53(){
        sampleClass = new SampleClass54();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}