package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1813 {

    @Ignore    private SampleClass1814 sampleClass;

    public SampleClass1813(){
        sampleClass = new SampleClass1814();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}