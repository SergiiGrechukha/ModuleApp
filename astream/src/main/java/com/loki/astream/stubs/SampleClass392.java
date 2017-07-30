package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass392 {

    @Ignore    private SampleClass393 sampleClass;

    public SampleClass392(){
        sampleClass = new SampleClass393();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}