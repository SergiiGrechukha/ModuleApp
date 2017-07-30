package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass435 {

    @Ignore    private SampleClass436 sampleClass;

    public SampleClass435(){
        sampleClass = new SampleClass436();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}