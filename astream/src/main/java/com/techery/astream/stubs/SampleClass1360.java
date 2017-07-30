package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1360 {

    @Ignore    private SampleClass1361 sampleClass;

    public SampleClass1360(){
        sampleClass = new SampleClass1361();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}