package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1720 {

    @Ignore    private SampleClass1721 sampleClass;

    public SampleClass1720(){
        sampleClass = new SampleClass1721();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}