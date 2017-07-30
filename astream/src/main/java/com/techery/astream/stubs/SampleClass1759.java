package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1759 {

    @Ignore    private SampleClass1760 sampleClass;

    public SampleClass1759(){
        sampleClass = new SampleClass1760();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}