package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass103 {

    @Ignore    private SampleClass104 sampleClass;

    public SampleClass103(){
        sampleClass = new SampleClass104();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}