package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1717 {

    @Ignore    private SampleClass1718 sampleClass;

    public SampleClass1717(){
        sampleClass = new SampleClass1718();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}