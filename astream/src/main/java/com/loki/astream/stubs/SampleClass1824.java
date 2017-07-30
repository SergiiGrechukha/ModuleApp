package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1824 {

    @Ignore    private SampleClass1825 sampleClass;

    public SampleClass1824(){
        sampleClass = new SampleClass1825();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}