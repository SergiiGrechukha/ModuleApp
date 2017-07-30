package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1661 {

    @Ignore    private SampleClass1662 sampleClass;

    public SampleClass1661(){
        sampleClass = new SampleClass1662();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}