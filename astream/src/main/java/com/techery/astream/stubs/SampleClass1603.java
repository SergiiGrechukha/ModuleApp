package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1603 {

    @Ignore    private SampleClass1604 sampleClass;

    public SampleClass1603(){
        sampleClass = new SampleClass1604();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}