package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1747 {

    @Ignore    private SampleClass1748 sampleClass;

    public SampleClass1747(){
        sampleClass = new SampleClass1748();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}