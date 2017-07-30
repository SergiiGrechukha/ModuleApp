package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1669 {

    @Ignore    private SampleClass1670 sampleClass;

    public SampleClass1669(){
        sampleClass = new SampleClass1670();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}