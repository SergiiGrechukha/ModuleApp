package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1244 {

    @Ignore    private SampleClass1245 sampleClass;

    public SampleClass1244(){
        sampleClass = new SampleClass1245();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}