package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass666 {

    @Ignore    private SampleClass667 sampleClass;

    public SampleClass666(){
        sampleClass = new SampleClass667();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}