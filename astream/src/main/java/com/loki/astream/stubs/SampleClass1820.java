package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1820 {

    @Ignore    private SampleClass1821 sampleClass;

    public SampleClass1820(){
        sampleClass = new SampleClass1821();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}