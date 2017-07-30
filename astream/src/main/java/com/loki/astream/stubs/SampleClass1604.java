package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1604 {

    @Ignore    private SampleClass1605 sampleClass;

    public SampleClass1604(){
        sampleClass = new SampleClass1605();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}