package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass391 {

    @Ignore    private SampleClass392 sampleClass;

    public SampleClass391(){
        sampleClass = new SampleClass392();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}