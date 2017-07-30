package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass785 {

    @Ignore    private SampleClass786 sampleClass;

    public SampleClass785(){
        sampleClass = new SampleClass786();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}