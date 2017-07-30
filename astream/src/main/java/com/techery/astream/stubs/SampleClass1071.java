package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1071 {

    @Ignore    private SampleClass1072 sampleClass;

    public SampleClass1071(){
        sampleClass = new SampleClass1072();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}