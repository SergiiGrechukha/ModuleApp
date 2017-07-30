package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass721 {

    @Ignore    private SampleClass722 sampleClass;

    public SampleClass721(){
        sampleClass = new SampleClass722();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}