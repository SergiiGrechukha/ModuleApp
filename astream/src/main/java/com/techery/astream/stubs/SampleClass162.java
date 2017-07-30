package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass162 {

    @Ignore    private SampleClass163 sampleClass;

    public SampleClass162(){
        sampleClass = new SampleClass163();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}