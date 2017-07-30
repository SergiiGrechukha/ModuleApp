package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1767 {

    @Ignore    private SampleClass1768 sampleClass;

    public SampleClass1767(){
        sampleClass = new SampleClass1768();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}