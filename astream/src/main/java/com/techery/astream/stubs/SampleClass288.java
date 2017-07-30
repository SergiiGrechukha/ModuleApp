package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass288 {

    @Ignore    private SampleClass289 sampleClass;

    public SampleClass288(){
        sampleClass = new SampleClass289();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}