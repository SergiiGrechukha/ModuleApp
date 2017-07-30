package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass727 {

    @Ignore    private SampleClass728 sampleClass;

    public SampleClass727(){
        sampleClass = new SampleClass728();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}