package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1875 {

    @Ignore    private SampleClass1876 sampleClass;

    public SampleClass1875(){
        sampleClass = new SampleClass1876();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}