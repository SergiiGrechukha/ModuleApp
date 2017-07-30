package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass717 {

    @Ignore    private SampleClass718 sampleClass;

    public SampleClass717(){
        sampleClass = new SampleClass718();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}