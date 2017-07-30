package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1647 {

    @Ignore    private SampleClass1648 sampleClass;

    public SampleClass1647(){
        sampleClass = new SampleClass1648();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}