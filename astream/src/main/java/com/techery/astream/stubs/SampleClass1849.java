package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1849 {

    @Ignore    private SampleClass1850 sampleClass;

    public SampleClass1849(){
        sampleClass = new SampleClass1850();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}