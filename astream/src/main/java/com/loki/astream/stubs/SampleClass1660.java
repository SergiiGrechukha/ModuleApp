package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1660 {

    @Ignore    private SampleClass1661 sampleClass;

    public SampleClass1660(){
        sampleClass = new SampleClass1661();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}