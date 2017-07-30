package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1744 {

    @Ignore    private SampleClass1745 sampleClass;

    public SampleClass1744(){
        sampleClass = new SampleClass1745();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}