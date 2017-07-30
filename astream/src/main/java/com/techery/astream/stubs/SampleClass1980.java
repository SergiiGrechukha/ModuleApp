package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1980 {

    @Ignore    private SampleClass1981 sampleClass;

    public SampleClass1980(){
        sampleClass = new SampleClass1981();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}