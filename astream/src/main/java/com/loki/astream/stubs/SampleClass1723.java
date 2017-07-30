package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1723 {

    @Ignore    private SampleClass1724 sampleClass;

    public SampleClass1723(){
        sampleClass = new SampleClass1724();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}