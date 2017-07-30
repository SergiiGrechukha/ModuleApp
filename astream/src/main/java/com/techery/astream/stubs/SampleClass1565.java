package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1565 {

    @Ignore    private SampleClass1566 sampleClass;

    public SampleClass1565(){
        sampleClass = new SampleClass1566();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}