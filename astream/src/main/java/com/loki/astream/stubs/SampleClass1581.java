package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1581 {

    @Ignore    private SampleClass1582 sampleClass;

    public SampleClass1581(){
        sampleClass = new SampleClass1582();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}