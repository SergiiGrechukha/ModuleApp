package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1430 {

    @Ignore    private SampleClass1431 sampleClass;

    public SampleClass1430(){
        sampleClass = new SampleClass1431();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}